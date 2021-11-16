package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainNameV2Props {

  def apply(
    domainName: String,
    tags: Option[AnyRef] = None,
    domainNameConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnDomainNameV2Props.Builder)
      .domainName(domainName)
      .tags(tags.orNull)
      .domainNameConfigurations(domainNameConfigurations.map(_.asJava).orNull)
      .build()
}
