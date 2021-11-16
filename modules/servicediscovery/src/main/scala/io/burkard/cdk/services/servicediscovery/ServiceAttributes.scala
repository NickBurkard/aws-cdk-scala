package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceAttributes {

  def apply(
    routingPolicy: software.amazon.awscdk.services.servicediscovery.RoutingPolicy,
    serviceName: String,
    serviceArn: String,
    dnsRecordType: software.amazon.awscdk.services.servicediscovery.DnsRecordType,
    serviceId: String,
    namespace: software.amazon.awscdk.services.servicediscovery.INamespace
  ): software.amazon.awscdk.services.servicediscovery.ServiceAttributes =
    (new software.amazon.awscdk.services.servicediscovery.ServiceAttributes.Builder)
      .routingPolicy(routingPolicy)
      .serviceName(serviceName)
      .serviceArn(serviceArn)
      .dnsRecordType(dnsRecordType)
      .serviceId(serviceId)
      .namespace(namespace)
      .build()
}
