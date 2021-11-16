package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateDnsNamespaceAttributes {

  def apply(
    namespaceArn: String,
    namespaceName: String,
    namespaceId: String
  ): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceAttributes =
    (new software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceAttributes.Builder)
      .namespaceArn(namespaceArn)
      .namespaceName(namespaceName)
      .namespaceId(namespaceId)
      .build()
}
