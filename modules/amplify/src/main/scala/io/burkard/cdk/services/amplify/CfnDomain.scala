package io.burkard.cdk.services.amplify

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomain {

  def apply(
    internalResourceId: String,
    autoSubDomainIamRole: Option[String] = None,
    enableAutoSubDomain: Option[Boolean] = None,
    domainName: Option[String] = None,
    autoSubDomainCreationPatterns: Option[List[String]] = None,
    subDomainSettings: Option[List[_]] = None,
    appId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amplify.CfnDomain =
    software.amazon.awscdk.services.amplify.CfnDomain.Builder
      .create(stackCtx, internalResourceId)
      .autoSubDomainIamRole(autoSubDomainIamRole.orNull)
      .enableAutoSubDomain(enableAutoSubDomain.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainName(domainName.orNull)
      .autoSubDomainCreationPatterns(autoSubDomainCreationPatterns.map(_.asJava).orNull)
      .subDomainSettings(subDomainSettings.map(_.asJava).orNull)
      .appId(appId.orNull)
      .build()
}
