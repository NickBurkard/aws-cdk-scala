package io.burkard.cdk.services.kinesisanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationProps {

  def apply(
    inputs: List[_],
    applicationName: Option[String] = None,
    applicationDescription: Option[String] = None,
    applicationCode: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder)
      .inputs(inputs.asJava)
      .applicationName(applicationName.orNull)
      .applicationDescription(applicationDescription.orNull)
      .applicationCode(applicationCode.orNull)
      .build()
}
