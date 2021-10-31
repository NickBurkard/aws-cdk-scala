package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlexaSkillEventProperty {

  def apply(
    variables: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder)
      .variables(variables.map(_.asJava).orNull)
      .build()
}
