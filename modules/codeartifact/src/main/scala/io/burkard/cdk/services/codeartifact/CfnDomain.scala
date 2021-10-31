package io.burkard.cdk.services.codeartifact

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomain {

  def apply(
    internalResourceId: String,
    permissionsPolicyDocument: Option[AnyRef] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    encryptionKey: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codeartifact.CfnDomain =
    software.amazon.awscdk.services.codeartifact.CfnDomain.Builder
      .create(stackCtx, internalResourceId)
      .permissionsPolicyDocument(permissionsPolicyDocument.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
