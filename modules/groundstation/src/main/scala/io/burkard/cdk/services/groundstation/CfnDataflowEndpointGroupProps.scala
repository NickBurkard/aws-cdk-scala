package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataflowEndpointGroupProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    endpointDetails: Option[List[_]] = None
  ): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps =
    (new software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .endpointDetails(endpointDetails.map(_.asJava).orNull)
      .build()
}
