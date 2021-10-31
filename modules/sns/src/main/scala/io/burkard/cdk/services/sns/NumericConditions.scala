package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NumericConditions {

  def apply(
    betweenStrict: Option[software.amazon.awscdk.services.sns.BetweenCondition] = None,
    allowlist: Option[List[_ <: Number]] = None,
    lessThan: Option[Number] = None,
    greaterThan: Option[Number] = None,
    greaterThanOrEqualTo: Option[Number] = None,
    lessThanOrEqualTo: Option[Number] = None,
    between: Option[software.amazon.awscdk.services.sns.BetweenCondition] = None
  ): software.amazon.awscdk.services.sns.NumericConditions =
    (new software.amazon.awscdk.services.sns.NumericConditions.Builder)
      .betweenStrict(betweenStrict.orNull)
      .allowlist(allowlist.map(_.asJava).orNull)
      .lessThan(lessThan.orNull)
      .greaterThan(greaterThan.orNull)
      .greaterThanOrEqualTo(greaterThanOrEqualTo.orNull)
      .lessThanOrEqualTo(lessThanOrEqualTo.orNull)
      .between(between.orNull)
      .build()
}
