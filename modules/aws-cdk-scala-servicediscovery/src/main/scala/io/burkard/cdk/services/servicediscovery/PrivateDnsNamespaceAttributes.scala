package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrivateDnsNamespaceAttributes {

  def apply(
    namespaceArn: Option[String] = None,
    namespaceName: Option[String] = None,
    namespaceId: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceAttributes =
    (new software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceAttributes.Builder)
      .namespaceArn(namespaceArn.orNull)
      .namespaceName(namespaceName.orNull)
      .namespaceId(namespaceId.orNull)
      .build()
}
