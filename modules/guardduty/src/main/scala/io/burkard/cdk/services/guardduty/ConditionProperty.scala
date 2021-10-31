package io.burkard.cdk.services.guardduty

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConditionProperty {

  def apply(
    gte: Option[Number] = None,
    lte: Option[Number] = None,
    lt: Option[Number] = None,
    eq: Option[List[String]] = None,
    neq: Option[List[String]] = None
  ): software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty =
    (new software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder)
      .gte(gte.orNull)
      .lte(lte.orNull)
      .lt(lt.orNull)
      .eq(eq.map(_.asJava).orNull)
      .neq(neq.map(_.asJava).orNull)
      .build()
}
