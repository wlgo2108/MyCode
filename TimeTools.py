#!/usr/bin/env python
#-*- coding:utf-8 -*-

import datetime
import time
import re

timematch = "^(((20[0-3][0-9]-(0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|(20[0-3][0-9]-(0[2469]|11)-(0[1-9]|[12][0-9]|30))) (20|21|22|23|[0-1][0-9]):[0-5][0-9]:[0-5][0-9])$"


#linux时间戳转换为显示的时间


def timestamp_datetime(value):
    format = '%Y-%m-%d %H:%M:%S'
    value = time.localtime(value)
    dt = time.strftime(format, value)
    return dt

#获取days天后的日期
def getDateAfter(dateValue,days) :
    timeformat = "%Y-%m-%d"
    if re.match(timematch, dateValue) != None:
        timeformat = "%Y-%m-%d %H:%M:%S"
    t = time.strptime(dateValue, timeformat)
    y, m, d = t[0:3]
    newDate = datetime.datetime(y, m, d) + datetime.timedelta(days=days)
    return newDate.strftime(timeformat)



def getDateBefore(dateValue,days) :
    timeformat = "%Y-%m-%d"
    if re.match(timematch,dateValue) != None :
        timeformat = "%Y-%m-%d %H:%M:%S"
    t = time.strptime(dateValue, timeformat)
    y, m, d = t[0:3]
    newDate = datetime.datetime(y, m, d) - datetime.timedelta(days=days)
    return newDate.strftime(timeformat)


def getDateFormat(dateValue) :
    if matchFormat(dateValue) :
        return dateValue.split(" ")[0]
    else :
        return dateValue

def matchFormat(dateValue) :
    if re.match(timematch,dateValue) != None :
        return True
    else :
        return False



print getDateFormat("2017-04-05 00:00:00")