package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DnsRecordProperty {

  def apply(
    ttl: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty.Builder)
      .ttl(ttl.orNull)
      .`type`(`type`.orNull)
      .build()
}