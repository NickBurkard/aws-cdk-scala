package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SrvRecordValue {

  def apply(
    weight: Option[Number] = None,
    priority: Option[Number] = None,
    hostName: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.route53.SrvRecordValue =
    (new software.amazon.awscdk.services.route53.SrvRecordValue.Builder)
      .weight(weight.orNull)
      .priority(priority.orNull)
      .hostName(hostName.orNull)
      .port(port.orNull)
      .build()
}
