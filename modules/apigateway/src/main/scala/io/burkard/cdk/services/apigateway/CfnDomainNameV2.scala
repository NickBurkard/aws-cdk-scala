package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainNameV2 {

  def apply(
    internalResourceId: String,
    domainName: String,
    tags: Option[AnyRef] = None,
    domainNameConfigurations: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnDomainNameV2 =
    software.amazon.awscdk.services.apigateway.CfnDomainNameV2.Builder
      .create(stackCtx, internalResourceId)
      .domainName(domainName)
      .tags(tags.orNull)
      .domainNameConfigurations(domainNameConfigurations.map(_.asJava).orNull)
      .build()
}
