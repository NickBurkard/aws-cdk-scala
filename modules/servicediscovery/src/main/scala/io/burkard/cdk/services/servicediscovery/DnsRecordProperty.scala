package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DnsRecordProperty {

  def apply(
    ttl: Number,
    `type`: String
  ): software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty.Builder)
      .ttl(ttl)
      .`type`(`type`)
      .build()
}
