package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MxRecordValue {

  def apply(
    priority: Option[Number] = None,
    hostName: Option[String] = None
  ): software.amazon.awscdk.services.route53.MxRecordValue =
    (new software.amazon.awscdk.services.route53.MxRecordValue.Builder)
      .priority(priority.orNull)
      .hostName(hostName.orNull)
      .build()
}
