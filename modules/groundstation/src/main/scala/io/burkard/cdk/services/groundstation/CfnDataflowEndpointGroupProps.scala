package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataflowEndpointGroupProps {

  def apply(
    endpointDetails: List[_],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps =
    (new software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps.Builder)
      .endpointDetails(endpointDetails.asJava)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
