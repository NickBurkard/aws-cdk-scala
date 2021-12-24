package io.burkard.cdk

/**
 * CDK stack.
 * @param id Optional stack ID.
 * @param props Optional stack properties.
 * @param appCtx CDK app context.
 */
abstract class CdkStack(
  id: Option[String] = None,
  props: Option[software.amazon.awscdk.StackProps] = None
)(implicit
  appCtx: software.amazon.awscdk.App
) extends software.amazon.awscdk.Stack(appCtx, id.orNull, props.orNull)  {

  // Context for initializing stack resources.
  protected[this] implicit lazy val stackCtx: software.amazon.awscdk.Stack = this
}

object CdkStack {

  /**
   * Create an anonymous instance of a custom stack.
   * @param id Optional stack ID.
   * @param props Optional stack properties.
   * @param resources Function for initializing stack resources.
   * @param appCtx CDK app context.
   * @tparam A Result of initializing stack resources.
   * @return CDK stack.
   */
  def apply[A](
    id: Option[String] = None,
    props: Option[software.amazon.awscdk.StackProps] = None
  )(
    resources: software.amazon.awscdk.Stack => A
  )(implicit appCtx: software.amazon.awscdk.App): software.amazon.awscdk.Stack =
    new CdkStack(id, props) { ValueDiscard[A](resources(stackCtx)) }
}
