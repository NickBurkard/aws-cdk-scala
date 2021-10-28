package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleGroupProperty {

  def apply(
    patchRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty =
    (new software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty.Builder)
      .patchRules(patchRules.map(_.asJava).orNull)
      .build()
}
