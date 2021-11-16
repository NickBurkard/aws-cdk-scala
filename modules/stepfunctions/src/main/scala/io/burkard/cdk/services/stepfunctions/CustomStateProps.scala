package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomStateProps {

  def apply(
    stateJson: Map[String, _]
  ): software.amazon.awscdk.services.stepfunctions.CustomStateProps =
    (new software.amazon.awscdk.services.stepfunctions.CustomStateProps.Builder)
      .stateJson(stateJson.asJava)
      .build()
}
