package io.burkard.cdk.services.kinesisanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    applicationName: Option[String] = None,
    inputs: Option[List[_]] = None,
    applicationDescription: Option[String] = None,
    applicationCode: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplication =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName.orNull)
      .inputs(inputs.map(_.asJava).orNull)
      .applicationDescription(applicationDescription.orNull)
      .applicationCode(applicationCode.orNull)
      .build()
}
