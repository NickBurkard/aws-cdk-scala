package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SrvRecordValue {

  def apply(
    weight: Number,
    priority: Number,
    hostName: String,
    port: Number
  ): software.amazon.awscdk.services.route53.SrvRecordValue =
    (new software.amazon.awscdk.services.route53.SrvRecordValue.Builder)
      .weight(weight)
      .priority(priority)
      .hostName(hostName)
      .port(port)
      .build()
}
