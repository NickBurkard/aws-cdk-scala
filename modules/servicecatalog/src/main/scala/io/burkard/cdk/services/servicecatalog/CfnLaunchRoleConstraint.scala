package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchRoleConstraint {

  def apply(
    internalResourceId: String,
    portfolioId: String,
    productId: String,
    description: Option[String] = None,
    roleArn: Option[String] = None,
    acceptLanguage: Option[String] = None,
    localRoleName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint =
    software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId)
      .productId(productId)
      .description(description.orNull)
      .roleArn(roleArn.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .localRoleName(localRoleName.orNull)
      .build()
}
