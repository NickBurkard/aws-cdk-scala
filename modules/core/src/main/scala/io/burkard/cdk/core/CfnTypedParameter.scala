package io.burkard.cdk.core

import scala.annotation.nowarn
import scala.collection.JavaConverters._

// CFN parameter with type safety.
sealed abstract class CfnTypedParameter(val name: String)(implicit
  val stackCtx: software.amazon.awscdk.Stack
) extends Product with Serializable {
  type Value

  def value: Value

  def underlying: software.amazon.awscdk.CfnParameter
}

@nowarn("cat=deprecation")
object CfnTypedParameter {
  final case class CfnStringParameter(
    override val name: String,
    minLength: Option[Number] = None,
    defaultValue: Option[AnyRef] = None,
    maxLength: Option[Number] = None,
    allowedPattern: Option[String] = None,
    noEcho: Option[Boolean] = None,
    constraintDescription: Option[String] = None,
    description: Option[String] = None,
    allowedValues: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack) extends CfnTypedParameter(name) {
    override type Value = String

    override def value: String = underlying.getValueAsString

    override val underlying: software.amazon.awscdk.CfnParameter =
      CfnParameter(
        name,
        minValue = None,
        minLength,
        defaultValue,
        maxLength,
        allowedPattern,
        noEcho,
        constraintDescription,
        description,
        allowedValues,
        maxValue = None,
        `type` = Some("String")
      )
  }

  final case class CfnNumberParameter(
    override val name: String,
    minValue: Option[Number] = None,
    defaultValue: Option[AnyRef] = None,
    noEcho: Option[Boolean] = None,
    constraintDescription: Option[String] = None,
    description: Option[String] = None,
    allowedValues: Option[List[String]] = None,
    maxValue: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack) extends CfnTypedParameter(name) {
    override type Value = Number

    override def value: Number = underlying.getValueAsNumber

    override val underlying: software.amazon.awscdk.CfnParameter =
      CfnParameter(
        name,
        minValue,
        minLength = None,
        defaultValue,
        maxLength = None,
        allowedPattern = None,
        noEcho,
        constraintDescription,
        description,
        allowedValues,
        maxValue,
        `type` = Some("Number")
      )
  }

  final case class CfnListNumberParameter(
    override val name: String,
    minValue: Option[Number] = None,
    defaultValue: Option[AnyRef] = None,
    noEcho: Option[Boolean] = None,
    constraintDescription: Option[String] = None,
    description: Option[String] = None,
    allowedValues: Option[List[String]] = None,
    maxValue: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack) extends CfnTypedParameter(name) {
    override type Value = List[String]

    override def value: List[String] = underlying.getValueAsList.asScala.toList

    override val underlying: software.amazon.awscdk.CfnParameter =
      CfnParameter(
        name,
        minValue,
        minLength = None,
        defaultValue,
        maxLength = None,
        allowedPattern = None,
        noEcho,
        constraintDescription,
        description,
        allowedValues,
        maxValue,
        `type` = Some("List<Number>")
      )
  }

  final case class CfnCommaDelimitedListParameter(
    override val name: String,
    minLength: Option[Number] = None,
    defaultValue: Option[AnyRef] = None,
    maxLength: Option[Number] = None,
    allowedPattern: Option[String] = None,
    noEcho: Option[Boolean] = None,
    constraintDescription: Option[String] = None,
    description: Option[String] = None,
    allowedValues: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack) extends CfnTypedParameter(name) {
    override type Value = List[String]

    override def value: List[String] = underlying.getValueAsList.asScala.toList

    override val underlying: software.amazon.awscdk.CfnParameter =
      CfnParameter(
        name,
        minValue = None,
        minLength,
        defaultValue,
        maxLength,
        allowedPattern,
        noEcho,
        constraintDescription,
        description,
        allowedValues,
        maxValue = None,
        `type` = Some("CommaDelimitedList")
      )
  }
}
