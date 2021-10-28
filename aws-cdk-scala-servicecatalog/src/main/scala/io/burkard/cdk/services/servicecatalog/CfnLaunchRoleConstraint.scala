package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLaunchRoleConstraint {

  def apply(
    internalResourceId: String,
    portfolioId: Option[String] = None,
    description: Option[String] = None,
    roleArn: Option[String] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None,
    localRoleName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint =
    software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId.orNull)
      .description(description.orNull)
      .roleArn(roleArn.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .localRoleName(localRoleName.orNull)
      .build()
}
