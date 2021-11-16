package io.burkard.cdk.services.dlm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    name: String,
    crossRegionCopy: List[_]
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty.Builder)
      .name(name)
      .crossRegionCopy(crossRegionCopy.asJava)
      .build()
}
