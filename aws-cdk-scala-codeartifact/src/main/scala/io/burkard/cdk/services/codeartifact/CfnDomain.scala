package io.burkard.cdk.services.codeartifact

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
