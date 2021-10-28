package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomStateProps {

  def apply(
    stateJson: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.stepfunctions.CustomStateProps =
    (new software.amazon.awscdk.services.stepfunctions.CustomStateProps.Builder)
      .stateJson(stateJson.map(_.asJava).orNull)
      .build()
}
