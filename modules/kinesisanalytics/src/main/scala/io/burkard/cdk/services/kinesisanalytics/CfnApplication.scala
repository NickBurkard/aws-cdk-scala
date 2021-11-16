package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    inputs: List[_],
    applicationName: Option[String] = None,
    applicationDescription: Option[String] = None,
    applicationCode: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplication =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .inputs(inputs.asJava)
      .applicationName(applicationName.orNull)
      .applicationDescription(applicationDescription.orNull)
      .applicationCode(applicationCode.orNull)
      .build()
}
