package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PatchSourceProperty {

  def apply(
    name: Option[String] = None,
    products: Option[List[String]] = None,
    configuration: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty =
    (new software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty.Builder)
      .name(name.orNull)
      .products(products.map(_.asJava).orNull)
      .configuration(configuration.orNull)
      .build()
}
