package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublicHostedZone {

  def apply(
    internalResourceId: String,
    queryLogsLogGroupArn: Option[String] = None,
    crossAccountZoneDelegationRoleName: Option[String] = None,
    zoneName: Option[String] = None,
    caaAmazon: Option[Boolean] = None,
    comment: Option[String] = None,
    crossAccountZoneDelegationPrincipal: Option[software.amazon.awscdk.services.iam.IPrincipal] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.PublicHostedZone =
    software.amazon.awscdk.services.route53.PublicHostedZone.Builder
      .create(stackCtx, internalResourceId)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName.orNull)
      .zoneName(zoneName.orNull)
      .caaAmazon(caaAmazon.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .comment(comment.orNull)
      .crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal.orNull)
      .build()
}
