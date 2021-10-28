package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlexaSkillEventProperty {

  def apply(
    variables: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder)
      .variables(variables.map(_.asJava).orNull)
      .build()
}
