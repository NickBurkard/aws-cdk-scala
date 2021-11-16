package io.burkard.cdk.services.codeartifact

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainProps {

  def apply(
    domainName: String,
    permissionsPolicyDocument: Option[AnyRef] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    encryptionKey: Option[String] = None
  ): software.amazon.awscdk.services.codeartifact.CfnDomainProps =
    (new software.amazon.awscdk.services.codeartifact.CfnDomainProps.Builder)
      .domainName(domainName)
      .permissionsPolicyDocument(permissionsPolicyDocument.orNull)
      .tags(tags.map(_.asJava).orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
