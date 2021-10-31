package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublicDnsNamespaceAttributes {

  def apply(
    namespaceArn: Option[String] = None,
    namespaceName: Option[String] = None,
    namespaceId: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes =
    (new software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes.Builder)
      .namespaceArn(namespaceArn.orNull)
      .namespaceName(namespaceName.orNull)
      .namespaceId(namespaceId.orNull)
      .build()
}
