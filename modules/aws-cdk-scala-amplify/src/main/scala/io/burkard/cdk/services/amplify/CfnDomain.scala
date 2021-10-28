package io.burkard.cdk.services.amplify

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
