package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputDefinitionProperty {

  def apply(
    attributes: List[_]
  ): software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty =
    (new software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty.Builder)
      .attributes(attributes.asJava)
      .build()
}
