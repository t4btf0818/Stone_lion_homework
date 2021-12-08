package com.bjtu.edu.exception;

/**
 * @project: HMS-mvc
 * @description: Student操作异常类
 */
public class StudentOperationException extends RuntimeException{
    private static final long serialVersionUID = -6415835066202472815L;

    public StudentOperationException(String msg){super(msg);}
}
