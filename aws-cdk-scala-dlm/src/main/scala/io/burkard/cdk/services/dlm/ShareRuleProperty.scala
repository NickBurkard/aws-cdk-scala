package io.burkard.cdk.services.dlm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
