package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqsProperty {

  def apply(
    queueUrl: Option[String] = None,
    useBase64: Option[Boolean] = None,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.SqsProperty.Builder)
      .queueUrl(queueUrl.orNull)
      .useBase64(useBase64.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .payload(payload.orNull)
      .build()
}
