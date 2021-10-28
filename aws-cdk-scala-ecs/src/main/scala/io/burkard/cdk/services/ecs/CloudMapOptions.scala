package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudMapOptions {

  def apply(
    name: Option[String] = None,
    containerPort: Option[Number] = None,
    container: Option[software.amazon.awscdk.services.ecs.ContainerDefinition] = None,
    dnsRecordType: Option[software.amazon.awscdk.services.servicediscovery.DnsRecordType] = None,
    cloudMapNamespace: Option[software.amazon.awscdk.services.servicediscovery.INamespace] = None,
    dnsTtl: Option[software.amazon.awscdk.Duration] = None,
    failureThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CloudMapOptions =
    (new software.amazon.awscdk.services.ecs.CloudMapOptions.Builder)
      .name(name.orNull)
      .containerPort(containerPort.orNull)
      .container(container.orNull)
      .dnsRecordType(dnsRecordType.orNull)
      .cloudMapNamespace(cloudMapNamespace.orNull)
      .dnsTtl(dnsTtl.orNull)
      .failureThreshold(failureThreshold.orNull)
      .build()
}
