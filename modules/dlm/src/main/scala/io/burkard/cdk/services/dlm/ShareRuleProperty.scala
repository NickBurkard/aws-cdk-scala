package io.burkard.cdk.services.dlm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ShareRuleProperty {

  def apply(
    unshareInterval: Option[Number] = None,
    unshareIntervalUnit: Option[String] = None,
    targetAccounts: Option[List[String]] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty.Builder)
      .unshareInterval(unshareInterval.orNull)
      .unshareIntervalUnit(unshareIntervalUnit.orNull)
      .targetAccounts(targetAccounts.map(_.asJava).orNull)
      .build()
}
