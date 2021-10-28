package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublicHostedZoneProps {

  def apply(
    queryLogsLogGroupArn: Option[String] = None,
    crossAccountZoneDelegationRoleName: Option[String] = None,
    zoneName: Option[String] = None,
    caaAmazon: Option[Boolean] = None,
    comment: Option[String] = None,
    crossAccountZoneDelegationPrincipal: Option[software.amazon.awscdk.services.iam.IPrincipal] = None
  ): software.amazon.awscdk.services.route53.PublicHostedZoneProps =
    (new software.amazon.awscdk.services.route53.PublicHostedZoneProps.Builder)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName.orNull)
      .zoneName(zoneName.orNull)
      .caaAmazon(caaAmazon.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .comment(comment.orNull)
      .crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal.orNull)
      .build()
}
