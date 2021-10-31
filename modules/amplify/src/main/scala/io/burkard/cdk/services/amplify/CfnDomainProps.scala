package io.burkard.cdk.services.amplify

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomainProps {

  def apply(
    autoSubDomainIamRole: Option[String] = None,
    enableAutoSubDomain: Option[Boolean] = None,
    domainName: Option[String] = None,
    autoSubDomainCreationPatterns: Option[List[String]] = None,
    subDomainSettings: Option[List[_]] = None,
    appId: Option[String] = None
  ): software.amazon.awscdk.services.amplify.CfnDomainProps =
    (new software.amazon.awscdk.services.amplify.CfnDomainProps.Builder)
      .autoSubDomainIamRole(autoSubDomainIamRole.orNull)
      .enableAutoSubDomain(enableAutoSubDomain.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainName(domainName.orNull)
      .autoSubDomainCreationPatterns(autoSubDomainCreationPatterns.map(_.asJava).orNull)
      .subDomainSettings(subDomainSettings.map(_.asJava).orNull)
      .appId(appId.orNull)
      .build()
}
