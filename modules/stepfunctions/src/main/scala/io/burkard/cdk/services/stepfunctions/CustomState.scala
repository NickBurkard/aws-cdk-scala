package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomState {

  def apply(
    internalResourceId: String,
    stateJson: Option[Map[String, _]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.CustomState =
    software.amazon.awscdk.services.stepfunctions.CustomState.Builder
      .create(stackCtx, internalResourceId)
      .stateJson(stateJson.map(_.asJava).orNull)
      .build()
}
