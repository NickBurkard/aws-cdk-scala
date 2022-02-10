package io.burkard.cdk

import scala.annotation.nowarn
import scala.collection.JavaConverters._

// CFN parameter with type safety.
sealed abstract class CfnTypedParameter(val name: String)(implicit
  val stackCtx: software.amazon.awscdk.Stack
) extends Product with Serializable {
  type Value

  def value: Value

  def `type`: String

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

    override val `type` = "String"

    override val underlying: software.amazon.awscdk.CfnParameter =
      software.amazon.awscdk.CfnParameter.Builder
        .create(stackCtx, name)
        .minLength(minLength.orNull)
        .defaultValue(defaultValue.orNull)
        .maxLength(maxLength.orNull)
        .allowedPattern(allowedPattern.orNull)
        .noEcho(noEcho.map(Boolean.box).orNull)
        .constraintDescription(constraintDescription.orNull)
        .description(description.orNull)
        .allowedValues(allowedValues.map(_.asJava).orNull)
        .`type`(`type`)
        .build()
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

    override val `type`: String = "Number"

    override val underlying: software.amazon.awscdk.CfnParameter =
      software.amazon.awscdk.CfnParameter.Builder
        .create(stackCtx, name)
        .minValue(minValue.orNull)
        .defaultValue(defaultValue.orNull)
        .noEcho(noEcho.map(Boolean.box).orNull)
        .constraintDescription(constraintDescription.orNull)
        .description(description.orNull)
        .allowedValues(allowedValues.map(_.asJava).orNull)
        .maxValue(maxValue.orNull)
        .`type`(`type`)
        .build()
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

    override val `type`: String = "List<Number>"

    override val underlying: software.amazon.awscdk.CfnParameter =
      software.amazon.awscdk.CfnParameter.Builder
        .create(stackCtx, name)
        .minValue(minValue.orNull)
        .defaultValue(defaultValue.orNull)
        .noEcho(noEcho.map(Boolean.box).orNull)
        .constraintDescription(constraintDescription.orNull)
        .description(description.orNull)
        .allowedValues(allowedValues.map(_.asJava).orNull)
        .maxValue(maxValue.orNull)
        .`type`(`type`)
        .build()
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

    override val `type`: String = "CommaDelimitedList"

    override val underlying: software.amazon.awscdk.CfnParameter =
      software.amazon.awscdk.CfnParameter.Builder
        .create(stackCtx, name)
        .minLength(minLength.orNull)
        .defaultValue(defaultValue.orNull)
        .maxLength(maxLength.orNull)
        .allowedPattern(allowedPattern.orNull)
        .noEcho(noEcho.map(Boolean.box).orNull)
        .constraintDescription(constraintDescription.orNull)
        .description(description.orNull)
        .allowedValues(allowedValues.map(_.asJava).orNull)
        .`type`(`type`)
        .build()
  }
}
