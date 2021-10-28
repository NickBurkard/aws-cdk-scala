package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceAttributes {

  def apply(
    routingPolicy: Option[software.amazon.awscdk.services.servicediscovery.RoutingPolicy] = None,
    serviceName: Option[String] = None,
    serviceArn: Option[String] = None,
    dnsRecordType: Option[software.amazon.awscdk.services.servicediscovery.DnsRecordType] = None,
    serviceId: Option[String] = None,
    namespace: Option[software.amazon.awscdk.services.servicediscovery.INamespace] = None
  ): software.amazon.awscdk.services.servicediscovery.ServiceAttributes =
    (new software.amazon.awscdk.services.servicediscovery.ServiceAttributes.Builder)
      .routingPolicy(routingPolicy.orNull)
      .serviceName(serviceName.orNull)
      .serviceArn(serviceArn.orNull)
      .dnsRecordType(dnsRecordType.orNull)
      .serviceId(serviceId.orNull)
      .namespace(namespace.orNull)
      .build()
}
