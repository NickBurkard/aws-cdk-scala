package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchRoleConstraintProps {

  def apply(
    portfolioId: Option[String] = None,
    description: Option[String] = None,
    roleArn: Option[String] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None,
    localRoleName: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps.Builder)
      .portfolioId(portfolioId.orNull)
      .description(description.orNull)
      .roleArn(roleArn.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .localRoleName(localRoleName.orNull)
      .build()
}
