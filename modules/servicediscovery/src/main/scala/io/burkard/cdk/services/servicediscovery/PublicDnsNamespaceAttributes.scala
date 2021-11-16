package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PublicDnsNamespaceAttributes {

  def apply(
    namespaceArn: String,
    namespaceName: String,
    namespaceId: String
  ): software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes =
    (new software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceAttributes.Builder)
      .namespaceArn(namespaceArn)
      .namespaceName(namespaceName)
      .namespaceId(namespaceId)
      .build()
}
