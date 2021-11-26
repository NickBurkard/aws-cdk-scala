package io.burkard.cdk.metadata

import java.util.{Map => JMap}

import scala.annotation.nowarn
import scala.collection.JavaConverters._

import io.burkard.cdk.JMapEncoderOps
import io.burkard.cdk.core.CfnTypedParameter

// https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-interface.html
final case class CloudFormationInterface(
  parameterGroups: Option[List[ParameterGroup]] = None,
  parameterLabels: Option[ParameterLabel] = None
)

object CloudFormationInterface {
  def build(
    groups: (Option[Label], List[CfnTypedParameter])*
  )(labels: (CfnTypedParameter, Label)*): CloudFormationInterface =
    CloudFormationInterface(
      parameterGroups =
        if (groups.isEmpty) {
          None
        } else {
          Some(
            groups
              .map((ParameterGroup.build _).tupled)
              .toList
          )
        },
      parameterLabels =
        if (labels.isEmpty) {
          None
        } else {
          Some(ParameterLabel.build(labels.toMap))
        }
    )

  @nowarn("cat=deprecation")
  implicit val jMapEncoder: JMapEncoder[CloudFormationInterface] = { cfi =>
    val maybeWithParameterGroups = cfi.parameterGroups.fold[Map[String, AnyRef]](Map.empty) { pgs =>
      Map("ParameterGroups" -> pgs.map(_.encode))
    }

    cfi.parameterLabels.fold(maybeWithParameterGroups) { pl =>
      maybeWithParameterGroups.+("ParameterLabels" -> pl.encode)
    }.asJava
  }
}

// https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-interface-parametergroup.html
final case class ParameterGroup(
  label: Option[Label] = None,
  parameters: Option[List[String]] = None
)

object ParameterGroup {
  def build(label: Option[Label] = None, parameters: List[CfnTypedParameter]): ParameterGroup =
    ParameterGroup(label, Some(parameters.map(_.name)))

  @nowarn("cat=deprecation")
  implicit val jMapEncoder: JMapEncoder[ParameterGroup] = { pg =>
    val maybeWithLabel = pg.label.fold[Map[String, AnyRef]](Map.empty) { l =>
      Map("Label" -> l.encode)
    }

    pg.parameters.fold(maybeWithLabel) { params =>
      maybeWithLabel.+("Parameters" -> params.asJava)
    }.asJava
  }
}

// https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-interface-parameterlabel.html
final case class ParameterLabel(labels: Map[String, Label])

object ParameterLabel {
  def build(labels: Map[CfnTypedParameter, Label]): ParameterLabel =
    ParameterLabel(labels.map { case (p, l) => p.name -> l })

  @nowarn("cat=deprecation")
  implicit val jMapEncoder: JMapEncoder[ParameterLabel] =
    _.labels.map { case (id, l) => (id, l.encode: AnyRef) }.asJava
}

// https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-interface-label.html
final case class Label(default: Option[String] = None)

object Label {
  def apply(default: String): Label =
    Label(Some(default))

  // Not UpperCamelCase on purpose.
  @nowarn("cat=deprecation")
  implicit val jMapEncoder: JMapEncoder[Label] =
    _.default.fold[Map[String, AnyRef]](Map.empty)(d => Map("default" -> d)).asJava
}

private[cdk] trait JMapEncoder[A] {
  def encode(value: A): JMap[String, AnyRef]
}

private[cdk] object JMapEncoder {
  def apply[A: JMapEncoder]: JMapEncoder[A] = implicitly[JMapEncoder[A]]
}
