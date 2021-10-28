package io.burkard.cdk.services.kinesisanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationProps {

  def apply(
    applicationName: Option[String] = None,
    inputs: Option[List[_]] = None,
    applicationDescription: Option[String] = None,
    applicationCode: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder)
      .applicationName(applicationName.orNull)
      .inputs(inputs.map(_.asJava).orNull)
      .applicationDescription(applicationDescription.orNull)
      .applicationCode(applicationCode.orNull)
      .build()
}
