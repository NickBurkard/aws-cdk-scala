package io.burkard.cdk.services.amplify

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomain {

  def apply(
    internalResourceId: String,
    domainName: String,
    subDomainSettings: List[_],
    appId: String,
    autoSubDomainIamRole: Option[String] = None,
    enableAutoSubDomain: Option[Boolean] = None,
    autoSubDomainCreationPatterns: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amplify.CfnDomain =
    software.amazon.awscdk.services.amplify.CfnDomain.Builder
      .create(stackCtx, internalResourceId)
      .domainName(domainName)
      .subDomainSettings(subDomainSettings.asJava)
      .appId(appId)
      .autoSubDomainIamRole(autoSubDomainIamRole.orNull)
      .enableAutoSubDomain(enableAutoSubDomain.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .autoSubDomainCreationPatterns(autoSubDomainCreationPatterns.map(_.asJava).orNull)
      .build()
}
