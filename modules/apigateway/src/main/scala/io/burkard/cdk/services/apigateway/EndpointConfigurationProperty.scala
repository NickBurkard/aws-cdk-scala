package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointConfigurationProperty {

  def apply(
    types: Option[List[String]] = None
  ): software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty =
    (new software.amazon.awscdk.services.apigateway.CfnDomainName.EndpointConfigurationProperty.Builder)
      .types(types.map(_.asJava).orNull)
      .build()
}
