package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpNamespaceAttributes {

  def apply(
    namespaceArn: String,
    namespaceName: String,
    namespaceId: String
  ): software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes =
    (new software.amazon.awscdk.services.servicediscovery.HttpNamespaceAttributes.Builder)
      .namespaceArn(namespaceArn)
      .namespaceName(namespaceName)
      .namespaceId(namespaceId)
      .build()
}
