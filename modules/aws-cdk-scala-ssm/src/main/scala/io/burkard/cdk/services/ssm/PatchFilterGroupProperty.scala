package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PatchFilterGroupProperty {

  def apply(
    patchFilters: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty =
    (new software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty.Builder)
      .patchFilters(patchFilters.map(_.asJava).orNull)
      .build()
}
